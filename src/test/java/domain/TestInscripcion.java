package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInscripcion {
    @Test
    public void puedeCursarAnalisis2() {
        Materia analisis1 = new Materia(null);
        Materia algebra = new Materia(null);
        List<Materia> correlativasAnalisis2 = new ArrayList<Materia>();
        correlativasAnalisis2.add(analisis1);
        correlativasAnalisis2.add(algebra);
        Materia analisis2 = new Materia(correlativasAnalisis2);

        Alumno alumnoDeAnalisis2 = new Alumno(correlativasAnalisis2);
        List<Materia> listaAnalisis2 = new ArrayList<Materia>();
        listaAnalisis2.add(analisis2);
        Inscripcion inscripcionAlumnoAM2 = new Inscripcion(listaAnalisis2, alumnoDeAnalisis2);
        Assert.assertTrue(inscripcionAlumnoAM2.aprobada());
    }

    @Test
    public void noPuedeCursarParadigmas() {
        Materia algoritmos = new Materia(null);
        Materia matematicaDiscreta = new Materia(null);
        List<Materia> correlativasParadigmas = new ArrayList<Materia>();
        correlativasParadigmas.add(algoritmos);
        correlativasParadigmas.add(matematicaDiscreta);
        Materia paradigmas = new Materia(correlativasParadigmas);

        List<Materia> materiasDelAlumno = new ArrayList<Materia>();
        correlativasParadigmas.add(algoritmos);
        Alumno alumnoDeAnalisis2 = new Alumno(materiasDelAlumno);
        List<Materia> listaParadigmas = new ArrayList<Materia>();
        listaParadigmas.add(paradigmas);
        Inscripcion inscripcionAlumnoAM2 = new Inscripcion(listaParadigmas, alumnoDeAnalisis2);
        Assert.assertFalse(inscripcionAlumnoAM2.aprobada());
    }
}
