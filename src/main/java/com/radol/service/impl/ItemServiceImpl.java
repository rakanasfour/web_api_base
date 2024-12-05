package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ItemDTO;
import com.radol.mapper.ChannelMapper;
import com.radol.mapper.ItemMapper;
import com.radol.model.Channel;
import com.radol.model.Item;
import com.radol.model.ItemChannel;
import com.radol.repository.ChannelRepository;
import com.radol.repository.ItemChannelRepository;
import com.radol.repository.ItemRepository;
import com.radol.service.ItemService;



@Service
public class ItemServiceImpl implements ItemService {
	
	
    @Autowired
    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;
    private final ChannelMapper channelMapper;
    private final ChannelRepository channelRepository;
    private final ItemChannelRepository itemChannelRepository;
    
    
    public ItemServiceImpl(ItemRepository itemRepository, ItemMapper itemMapper,  ChannelMapper channelMapper, ChannelRepository channelRepository,  ItemChannelRepository itemChannelRepository) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
        this.channelMapper=channelMapper;
        this.channelRepository=channelRepository;
        this.itemChannelRepository=itemChannelRepository;
    }

    @Override
    public ItemDTO save(ItemDTO dto) {
        Item item = itemMapper.toEntity(dto);

        // Process channels and create ItemChannel entries
        if (dto.getChannels() != null && !dto.getChannels().isEmpty()) {
            List<ItemChannel> itemChannels = dto.getChannels().stream().map(channelDto -> {
                Channel channel = channelRepository.findById(channelDto.getChannelId())
                        .orElseThrow(() -> new RuntimeException("Channel not found"));
                ItemChannel itemChannel = new ItemChannel();
                itemChannel.setMappedItemChannel(item);
                itemChannel.setMappedChannel(channel);
                return itemChannel;
            }).collect(Collectors.toList());
            item.setItemChannels(itemChannels);
        }

        Item savedItem = itemRepository.save(item);
        return itemMapper.toDTO(savedItem);
    }
    
    

    @Override
    public ItemDTO findById(Integer id) {
        return itemRepository.findById(id)
                .map(itemMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Item not found"));
    }

    @Override
    public List<ItemDTO> findAll() {
        return itemRepository.findAll().stream()
                .map(itemMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ItemDTO update(Integer id, ItemDTO dto) {
        Item item = itemMapper.toEntity(dto);
        item.setItemId(id);
        return itemMapper.toDTO(itemRepository.save(item));
    }

    @Override
    public void deleteById(Integer id) {
        itemRepository.deleteById(id);
    }
}
