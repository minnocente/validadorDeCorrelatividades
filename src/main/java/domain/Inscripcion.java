package domain;

import java.util.List;

public class Inscripcion {
    private List<Materia> materias;
    private Alumno alumno;
    public boolean aprobada()
    {
        //todo
        return this.materias.stream().allMatch(unaMateria -> unaMateria.correlativasAprobadas(this.alumno));
    }

    public Inscripcion(List<Materia> materias, Alumno alumno) {
        this.materias = materias;
        this.alumno = alumno;
    }
}
