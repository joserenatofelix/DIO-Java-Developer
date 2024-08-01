package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    /**
     *
     * @param bairro bairro referência para o filtro
     * @return lista de alunos matriculados que residem no bairro passado como parâmetro
     */

    List<Matricula> findByAlunoBairro(String bairro);

//Outras formas de fazer a mesma coisa:

    /*
    @Query(value = "SELECT * FROM tb_matricula m " +
        "INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
        "WHERE a.bairro = :bairro", nativeQuery = true)
    List<Matricula> findByAlunoMatriculadosBairro(String bairro);
    */
//----------------------------------------------------------------
    /*
    @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
    List<Matricula> findByAlunoMatriculadosBairro(String bairro);
    */
}

























