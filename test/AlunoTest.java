import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @org.junit.jupiter.api.Test
    void testeMedia() {
        // preparacao
        Aluno aluno = new Aluno();
        aluno.setP1(8);
        aluno.setP2(10);
       //execucao
        float media = aluno.Media();

        //validacao
        assertEquals(9,media);
    }

    @org.junit.jupiter.api.Test
    void testeAprovado()
    {
        // preparacao
        Aluno aluno = new Aluno();
        aluno.setP1(8);
        aluno.setP2(10);

        //validacao
        assertTrue(aluno.Aprovado());

    }

    @org.junit.jupiter.api.Test
    void testeReprovado()
    {
        // preparacao
        Aluno aluno = new Aluno();
        aluno.setP1(2);
        aluno.setP2(4);

        //validacao
        assertFalse(aluno.Aprovado());


    }
}