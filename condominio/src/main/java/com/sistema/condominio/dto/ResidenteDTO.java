package com.sistema.condominio.dto;

public class ResidenteDTO {
    private Long id;
    private String nombre;
    private String numeroDepartamento;

    public ResidenteDTO() {}

    public ResidenteDTO(Long id, String nombre, String numeroDepartamento) {
        this.id = id;
        this.nombre = nombre;
        this.numeroDepartamento = numeroDepartamento;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getNumeroDepartamento() { return numeroDepartamento; }
    public void setNumeroDepartamento(String numeroDepartamento) { this.numeroDepartamento = numeroDepartamento; }
}
