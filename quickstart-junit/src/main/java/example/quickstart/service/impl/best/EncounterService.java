package example.quickstart.service.impl.best;

import java.util.List;

import example.quickstart.service.impl.best.dto.CheckInRequest;
import example.quickstart.service.impl.best.dto.Encounter;
import example.quickstart.service.impl.best.dto.Patient;

public interface EncounterService {
  Encounter checkIn(CheckInRequest checkInRequest);
  void discharge(Encounter encounter);
  
  List<Encounter> retreiveBy(Patient patient);
}
