package com.example.revision.services;

import com.example.revision.entity.Utilisateur;
import com.example.revision.repository.UtilisateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    private  UtilisateurRepository utilisateurRepository;


    public Utilisateur ajouterUtilisateur(Utilisateur u) {

        Utilisateur user = utilisateurRepository.save(u);
        return user;

    }

    public void deleteUtilisateur(int id) {
        utilisateurRepository.deleteById(id);
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurRepository.findAll();
    }

}
