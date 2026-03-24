package capgi.com.controller;



import capgi.com.entity.Panda;
import capgi.com.service.PandaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequiredArgsConstructor
@RequestMapping("/panda")
public class PandaController {

    private final PandaService pandaService;
    public PandaController(PandaService pandaService) {
        this.pandaService = pandaService;
    }
    @PostMapping("/save")
    public String savePanda(@RequestBody Panda panda)
    {
        pandaService.save(panda);
        return "Panda Saved in DB";
    }
    @PutMapping("/update/{id}")
    public String updatePanda(@PathVariable Integer id, @RequestBody Panda panda)
    {
        pandaService.updatePanda(id,panda);
        return "panda updated";
    }
    @GetMapping("/findall")
    public List<Panda> findAll()
    {
        return pandaService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id)
    {
        pandaService.deleteById(id);
        return "panda with id:"+ id + "Deleted";
    }




}
