package vn.com.iuh.fit.BackEnd.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import vn.com.iuh.fit.BackEnd.services.CandidateServices;

@RestController("/api/vi")
public class CandidateResources {
    @Autowired
    private CandidateServices services;
}
