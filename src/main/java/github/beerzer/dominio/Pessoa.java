package github.beerzer.dominio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "nome", length = 150)
    private String nome;

    @NotEmpty
    @Column(name = "sobrenome", length = 150)
    private String sobrenome;

    @NotNull
    @Column(name = "email", length = 150)
    private String email;

    @Column(name = "senha", length = 8)
    private String senha;

    @CPF
    @Column(name = "cpf", length = 11)
    private String cpf;

    @Column(name = "data_Nascimento")
    private LocalDate dataNascimento;

    @Column(name = "tipo")
    private Long tipo;


}
