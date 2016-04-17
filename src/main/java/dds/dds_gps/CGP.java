package dds.dds_gps;

import java.time.LocalTime;
import java.util.ArrayList;

public class CGP extends Poi{

	ArrayList<HorarioAtencion> horarios;
	
	CGP(Posicion posicion, String nom, String calle, int num,ArrayList<HorarioAtencion> horarios) {
		super(posicion, nom, calle, num);
		this.horarios = horarios;
	}
	
	public boolean estaDisponible(LocalTime now, String dia){
		horarios.stream().anyMatch(horario -> horario.estaEnHorario(now, dia));
		return false;
	}
	
	
}
