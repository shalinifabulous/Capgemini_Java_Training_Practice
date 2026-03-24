package capgi.com.service.impl;


import capgi.com.entity.Panda;
import capgi.com.repository.PandaRepository;
import capgi.com.service.PandaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PandaServiceImpl implements PandaService {

    private final PandaRepository pandaRepository;
    public PandaServiceImpl(PandaRepository pandaRepository) {
        this.pandaRepository = pandaRepository;
    }

    @Override
    public void save(Panda panda) {
        pandaRepository.save(panda);
    }

    @Override
    public void updatePanda(Integer id, Panda panda) {

        Optional<Panda> existing = pandaRepository.findById(id);

        if (existing.isPresent()) {
            Panda panda1 = existing.get();
            panda1.setName(panda.getName());
            panda1.setWeight(panda.getWeight());

            pandaRepository.save(panda1);
        }
    }

    @Override
    public List<Panda> findAll() {
        return pandaRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        pandaRepository.deleteById(id);
    }


}