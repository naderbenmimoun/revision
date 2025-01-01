package com.example.revision.controller;

import com.example.revision.entity.Utilisateur;
import com.example.revision.services.UtilisateurService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("utilisateurs")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping("/add")
    public Utilisateur ajouterutilisateur (@RequestBody Utilisateur u) {
        if (u == null) {
            System.out.println("Received Utilisateur is null");
        } else {
            System.out.println("Received Utilisateur: " + u);
        }
        Utilisateur user = utilisateurService.ajouterUtilisateur(u);
        return user;

    }

    @DeleteMapping("/delete/{id}")
    public void supprimerutilisateur (@PathVariable int id) {
        utilisateurService.deleteUtilisateur(id);
    }

    @GetMapping("/getAll")
    public List<Utilisateur> getAllutilisateur() {
        return utilisateurService.getUtilisateurs();
    }
}
