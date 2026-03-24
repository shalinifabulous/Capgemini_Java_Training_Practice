package capgi.com.service;



import capgi.com.entity.Panda;

import java.util.List;

public interface PandaService {


    void save(Panda panda);

    void updatePanda(Integer id, Panda panda);

    List<Panda> findAll();

    void deleteById(Integer id);
}

