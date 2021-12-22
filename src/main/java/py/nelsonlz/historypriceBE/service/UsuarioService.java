package py.nelsonlz.historypriceBE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import py.nelsonlz.historypriceBE.dto.UsuarioDTO;
import py.nelsonlz.historypriceBE.entity.Usuario;
import py.nelsonlz.historypriceBE.repository.UsuarioDAO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioService implements UsuarioDAO{
    @Autowired
    private UsuarioDAO usuarioDAO;

    public UsuarioDTO getUserById(int i){
        return new UsuarioDTO(usuarioDAO.findById(i).get());
    }
    public List<UsuarioDTO> getAllUsers(){
        return usuarioDAO.findAll()
                .stream()
                .map(UsuarioDTO::new)
                .collect(Collectors.toList());
    }
    public UsuarioDTO login(Usuario usuario){
        Usuario usu =  this.findByEmail(usuario.getEmail());
        if(usu.getPass() == usuario.getPass()){
            return new UsuarioDTO(usu);
        } else {
            return null;
        }
    }

    @Override
    public <S extends Usuario> boolean exists(Example<S> example) {
        return false;
    }
    @Override
    public List<Usuario> findAll() {
        return null;
    }

    @Override
    public List<Usuario> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Usuario> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Usuario> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {}

    @Override
    public void delete(Usuario entity) {}

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {}

    @Override
    public void deleteAll(Iterable<? extends Usuario> entities) {}

    @Override
    public void deleteAll() {}

    @Override
    public <S extends Usuario> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Usuario> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Usuario> findById(Integer id) {
        return usuarioDAO.findById(id);
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {}

    @Override
    public <S extends Usuario> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Usuario> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Usuario> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Usuario getOne(Integer integer) {
        return null;
    }

    @Override
    public Usuario getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Usuario> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Usuario> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Usuario> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Usuario> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Usuario> long count(Example<S> example) {
        return 0;
    }

    @Override
    public Usuario findByEmail(String email) {
        return usuarioDAO.findByEmail(email);
    }
}
