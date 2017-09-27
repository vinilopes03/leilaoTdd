/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.leilao.Lance;
import com.mycompany.leilao.Leilao;
import com.mycompany.leilao.Usuario;
import com.mycompany.leilao.servico.Avaliador;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author vinic
 */
public class TestAvaliador {

    public TestAvaliador() {
    }

    @Test
    public void TesteAvaliador() {
        Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("Jose");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 3");
        leilao.propoe(new Lance(joao, 250.0));
        leilao.propoe(new Lance(jose, 300.0));
        leilao.propoe(new Lance(maria, 400.0));

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        double maiorEsperado = 400;
        double menorEsperado = 250;
        

        Assert.assertTrue(maiorEsperado == leiloeiro.getMaiorLance());
        Assert.assertTrue(menorEsperado == leiloeiro.getMenorLance());
    }

}
