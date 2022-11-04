package copetsystem.api.service;

import copetsystem.api.model.Imc;
import copetsystem.api.repository.ImcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImcService {
    @Autowired
    private ImcRepository imcRepository;

    public void add(Imc imc) {
        imcRepository.save(imc);
    }

    public List<Imc> findAll() {
        return imcRepository.findAll();
    }
}
