package test;

import empresa.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtendentTest {


        private Atendente administrador;
        private Atendente suporteNivel2;
        private Atendente suporteNivel1;

        @BeforeEach
        public void setup() {
            administrador = new Administrador(null);
            suporteNivel2 = new SuporteNivel2(administrador);
            suporteNivel1 = new SuporteNivel1(suporteNivel2);
        }

        @Test
        public void testResolverProblemaNoNivel1() {
            Problema problemaSenha = new Problema(TipoProblemaSenha.getInstance());
            String resultado = suporteNivel1.resolverProblema(problemaSenha);
            assertEquals("Suporte Nível 1", resultado);
        }

        @Test
        public void testResolverProblemaNoNivel2() {
            Problema problemaEmail = new Problema(TipoProblemaEmail.getInstance());
            String resultado = suporteNivel1.resolverProblema(problemaEmail);
            assertEquals("Suporte Nível 2", resultado);
        }

        @Test
        public void testResolverProblemaNoAdministrador() {
            Problema problemaRede = new Problema(TipoProblemaRede.getInstance());
            String resultado = suporteNivel1.resolverProblema(problemaRede);
            assertEquals("Administrador", resultado);
        }

        @Test
        public void testProblemaNaoResolvido() {
            TipoProblema problemaDesconhecido = new TipoProblema() {};
            Problema problema = new Problema(problemaDesconhecido);
            String resultado = suporteNivel1.resolverProblema(problema);
            assertEquals("Problema não resolvido", resultado);
        }
    }

