package com.kdr.htk.web.rest;

import com.kdr.htk.domain.Vehicule;
import com.kdr.htk.service.VehiculeService;
import com.kdr.htk.service.dto.VehiculeDTO;
import com.kdr.htk.web.rest.request.UserCommentRequest;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.jhipster.web.util.HeaderUtil;

@RestController
@RequestMapping("/api/test")
public class VehiculeResource {

    private final Logger log = LoggerFactory.getLogger(VehiculeResource.class);

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final VehiculeService vehiculeService;

    public VehiculeResource(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    /**
     * Utilisateurs qui peuvent ajouter des commentaires sur les voitures.
     * @return
     */
    @PostMapping(value = "/user/comment/voiture", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Vehicule> userComment(@RequestBody UserCommentRequest UserCommentRequest) {
        Vehicule vehicule = vehiculeService.doCommentVoiture(UserCommentRequest);
        return ResponseEntity.ok(vehicule);
    }

    /**
     * L'utilisateur non connecté peut voir la liste mais pas les commentaires.
     * On ne doit pouvoir accéder aux commentaires seulement si on est connecté.
     * @return
     */
    @GetMapping(value = "/list/voiture", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Vehicule>> listVoiture() {
        List<Vehicule> vehiculeList = vehiculeService.getAllVehicule();
        return ResponseEntity.ok(vehiculeList);
    }
}
