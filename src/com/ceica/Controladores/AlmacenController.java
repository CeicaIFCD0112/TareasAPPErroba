package com.ceica.Controladores;

import com.ceica.modelos.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el controlador de un almacén.
 */
public class AlmacenController {

    private List<Usuario> usuarioList;
    private List<Task> taskList;
    public AlmacenController() {

        usuarioList = new ArrayList<>();
        taskList = new ArrayList<>();
        usuarioList = Usuario.getUsuario();
        taskList = TaskList.getTaskList();
        Usuario usuario = new Usuario(1, "nuevo");
        usuario.add(usuario);
        task.add(new Task(2, "nueva"));
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
