package br.com.treina.recife.sgp.api.model;

import java.time.LocalDate;
import br.com.treina.recife.sgp.api.model.enums.StatusProjeto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TB_PROJETOS") // @entity cria uma tabela
public class Projeto {

    @Id // chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)// @column cria uma coluna
    private String nome;

    @Column(columnDefinition = "TEXT") // em mysql utiliza o TEXT
    private String descricao;

    @Column(nullable = false)
    private LocalDate dataInicio;

    private LocalDate dataConclusao;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusProjeto status;

    @ManyToOne
    @JoinColumn(nullable = false, name = "usuario_resp_id")
    private Usuario responsavel;

}
