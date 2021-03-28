package com.company.modelo;

public enum Categoria {
    ELETRONICOS;

    public static Categoria procurarCategoria(String descricao) {
        for (Categoria categoria : values()) {
            if (categoria.name().equalsIgnoreCase(descricao)) {
                return categoria;
            }
        }
        return null;
    }
}
