package py.nelsonlz.historypriceBE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import py.nelsonlz.historypriceBE.entity.Ciudad;
import py.nelsonlz.historypriceBE.repository.CiudadDAO;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadService implements CiudadDAO {
    @Autowired
    private CiudadDAO dao;

    @Override
    public List<Ciudad> findByDescripcion(String descripcion) {
        return dao.findByDescripcion(descripcion);
    }
    @Override
    public List<Ciudad> findByDescripcionContainingIgnoreCase(String descripcion) {
        return dao.findByDescripcionContainingIgnoreCase(descripcion);
    }
    @Override
    public List<Ciudad> findAll() {
        return dao.findAll();
    }
    @Override
    public long count() {
        return dao.count();
    }
    @Override
    public Optional<Ciudad> findById(Integer id) {
        return Optional.of(dao.findById(id).get());
    }
    @Override
    public boolean existsById(Integer id) {
        return dao.existsById(id);
    }

    @Override
    public List<Ciudad> findAll(Sort sort) {
        return null;
    }
    @Override
    public Page<Ciudad> findAll(Pageable pageable) {
        return null;
    }
    @Override
    public List<Ciudad> findAllById(Iterable<Integer> integers) {
        return null;
    }
    @Override
    public void deleteById(Integer integer) {}
    @Override
    public void delete(Ciudad entity) {}
    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {}
    @Override
    public void deleteAll(Iterable<? extends Ciudad> entities) {}
    @Override
    public void deleteAll() {}
    @Override
    public <S extends Ciudad> S save(S entity) {
        return null;
    }
    @Override
    public <S extends Ciudad> List<S> saveAll(Iterable<S> entities) {
        return null;
    }
    @Override
    public void flush() {}
    @Override
    public <S extends Ciudad> S saveAndFlush(S entity) {
        return null;
    }
    @Override
    public <S extends Ciudad> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }
    @Override
    public void deleteAllInBatch(Iterable<Ciudad> entities) {}
    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {}
    @Override
    public void deleteAllInBatch() {}
    @Override
    public Ciudad getOne(Integer integer) {
        return null;
    }
    @Override
    public Ciudad getById(Integer integer) {
        return null;
    }
    @Override
    public <S extends Ciudad> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }
    @Override
    public <S extends Ciudad> List<S> findAll(Example<S> example) {
        return null;
    }
    @Override
    public <S extends Ciudad> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }
    @Override
    public <S extends Ciudad> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }
    @Override
    public <S extends Ciudad> long count(Example<S> example) {
        return 0;
    }
    @Override
    public <S extends Ciudad> boolean exists(Example<S> example) {
        return false;
    }
}
