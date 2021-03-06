package com.residencia.firstapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.firstapi.entity.Editora;
import com.residencia.firstapi.repository.EditoraRepository;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository editoraRepository;

    public List<Editora> findAll(){
        return editoraRepository.findAll();
    }

    public Editora findById(Integer id){
        return editoraRepository.findById(id).get();
    }

    public Editora save(Editora editora){
        return editoraRepository.save(editora);
    }

    public Editora update(Editora editora, Integer id){
    	Editora editoraAtualizado = findById(id);
		editoraAtualizado.setEditoraNome(editora.getEditoraNome());
    	return editoraRepository.save(editoraAtualizado);
    }

    public void delete(Integer id){
        Editora editora = editoraRepository.findById(id).get();
        editoraRepository.delete(editora);
    }
}
