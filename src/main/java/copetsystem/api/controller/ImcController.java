package copetsystem.api.controller;

import copetsystem.api.model.Imc;
import copetsystem.api.service.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/v1/imc"})
public class ImcController {

    @Autowired
    private ImcService imcService;

    @PostMapping
    public ResponseEntity<Imc> add(@RequestBody Imc registroImc){
        imcService.add(registroImc);
        return ResponseEntity.badRequest().body(registroImc);
    }

    @GetMapping
    public ResponseEntity<List<Imc>> findAll(){
        return ResponseEntity.ok().body(imcService.findAll());
    }
}
