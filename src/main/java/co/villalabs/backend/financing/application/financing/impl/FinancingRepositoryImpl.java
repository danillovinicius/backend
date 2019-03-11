package co.villalabs.backend.financing.application.financing.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import co.villalabs.backend.financing.domain.financing.Financing;
import co.villalabs.backend.financing.domain.financing.FinancingRepository;

public class FinancingRepositoryImpl implements FinancingRepository {

    @Override
    public List<Financing> findAll() {
        return null;
    }

    @Override
    public List<Financing> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<Financing> findAllById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public <S extends Financing> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Financing> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Financing> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Financing getOne(Long id) {
        return null;
    }

    @Override
    public <S extends Financing> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Financing> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<Financing> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Financing> S save(S entity) {
        return null;
    }

    @Override
    public Optional<Financing> findById(Long id) {
        return null;
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Financing entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Financing> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Financing> Optional<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Financing> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Financing> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Financing> boolean exists(Example<S> example) {
        return false;
    }

}