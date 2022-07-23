package UsesCases.Command.Tripulante.Eliminar;

import Dto.Tripulante.TripulanteDto;
import fourteam.mediator.Request;
import java.util.UUID;

public class EliminarTripulanteCommand implements Request<TripulanteDto> {

	TripulanteDto tripulante;

	public EliminarTripulanteCommand(UUID key) {
		this.tripulante = new TripulanteDto();
		this.tripulante.Key = key;
	}
}
