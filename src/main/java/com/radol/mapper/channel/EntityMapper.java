package com.radol.mapper.channel;

public interface EntityMapper<D, E> {
    D toDTO(E entity);
    E toEntity(D dto);
}