package dds.dds_gps;

import java.time.LocalTime;
import java.util.ArrayList;

public class HorarioAtencion {

	private String servicio;
	ArrayList<String> dias;
	private LocalTime horarioInicio;
	private LocalTime horarioFin;
	
	HorarioAtencion(String ser, ArrayList<String> dia, int horaInicio, int horaFin, int minutoInicio, int minutoFin){
		servicio = ser;
		this.dias = dia;
		horarioInicio = LocalTime.of (horaInicio, minutoInicio);
		horarioFin = LocalTime.of (horaFin, minutoFin);
	}
	
	public boolean estaEnHorario(LocalTime horario, String dia){
		return horario.isAfter(horarioInicio) && horario.isBefore(horarioFin) && dias.contains(dia);
	}
	
}
