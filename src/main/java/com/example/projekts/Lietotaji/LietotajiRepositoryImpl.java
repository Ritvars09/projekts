package com.example.projekts.Lietotaji;

import java.util.Optional;

public class LietotajiRepositoryImpl implements LietotajiRepository {
    @Override
    public <S extends Lietotaji> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Lietotaji> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Lietotaji> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Lietotaji> findAll() {
        return null;
    }

    @Override
    public Iterable<Lietotaji> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Lietotaji entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Lietotaji> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
