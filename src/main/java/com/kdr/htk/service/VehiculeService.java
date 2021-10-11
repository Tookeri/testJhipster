package com.kdr.htk.service;

import com.kdr.htk.domain.Comment;
import com.kdr.htk.domain.Vehicule;
import com.kdr.htk.repository.VehiculeRepository;
import com.kdr.htk.service.dto.AdminUserDTO;
import com.kdr.htk.service.dto.CommentDTO;
import com.kdr.htk.service.dto.VehiculeDTO;
import com.kdr.htk.web.rest.errors.EmailAlreadyUsedException;
import com.kdr.htk.web.rest.request.UserCommentRequest;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VehiculeService {

    private final Logger log = LoggerFactory.getLogger(VehiculeService.class);

    private final VehiculeRepository vehiculeRepository;

    public VehiculeService(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    /**
     * Récuperer la liste des voitures.
     * @return
     */
    public List<Vehicule> getAllVehicule() {
        return vehiculeRepository.findAll();
    }

    /**
     * Commenter une voiture.
     * @param userCommentRequest
     * @return
     */
    public Vehicule doCommentVoiture(UserCommentRequest userCommentRequest) {
        Optional<Vehicule> checkVoiture = vehiculeRepository.findById(userCommentRequest.getVoitureId());
        if (checkVoiture.isPresent()) {
            Vehicule voiture = checkVoiture.get();
            voiture.setComments(userCommentRequest.getComments());
            vehiculeRepository.save(voiture);
            return voiture;
        }
        return null;
    }
}
