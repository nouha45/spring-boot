package com.example.exempleTp.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/")
public class ModuleControleur {
    @Autowired
    private ModuleService moduleService;
    @GetMapping("modules")
    public List<Module> getModules() {
        return moduleService.getAllModules();
    }

    @GetMapping("modules/{id}")
    public Optional<Module> getModule(@PathVariable Integer id){
        return moduleService.getModule(id);
    }
    @PostMapping ("ajouter")
    public void ajouterModule(@RequestBody Module module) {
        moduleService.ajouterModule(module);
    }
   @PutMapping("modules/{id}")
    public void modifierModule(@RequestBody Module module, @PathVariable Integer id) {
        moduleService.modifierModule(id, module);
    }
  @DeleteMapping("modules/{id}")
    public void supprimerModule(@PathVariable Integer id) {
        moduleService.supprimerModule(id);
    }

}
