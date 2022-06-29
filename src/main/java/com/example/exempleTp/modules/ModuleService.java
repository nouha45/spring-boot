package com.example.exempleTp.modules;


import com.example.exempleTp.modules.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.exempleTp.modules.Module;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ModuleService {
    @Autowired
    private ModuleRepository moduleRepository;

    private List<Module> modules= new ArrayList<>(Arrays.asList(new Module(1,"La plateforme Java Standard Edition","Description de la plateforme Java SE")));


    public List<Module> getAllModules() {
        List<Module> modules=new ArrayList<>();
        moduleRepository.findAll().forEach(modules::add);
        return modules;
    }
     public void ajouterModule(Module module) {
        moduleRepository.save(module);
    }


    /*public Module getModule(Integer id) {
        for (Module module : modules) {
            if (id.equals(module.getId())) {

                return module;
            }
        }
        return null;}*/
    public Optional<Module> getModule(Integer id) {
        return moduleRepository.findById(id);
    }

    public void modifierModule(Integer id, Module module) {
        for (int i=0; i<modules.size(); i++) {
            Module m = modules.get(i);
            if (id.equals(m.getId())) {
                modules.set(i, module);
                return;
            }

}}
    public void supprimerModule(Integer id) {
        modules.removeIf(m -> id.equals(m.getId()));
    }}
