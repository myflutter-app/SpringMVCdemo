package bluenext.service;

import bluenext.model.Anagrafica;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnagService {
    private List<Anagrafica> anagrafiche = new ArrayList<>();
    public List<Anagrafica> getAnagrafiche() {
        return anagrafiche;
    }

    public void addAnagrafica(Anagrafica a){
        anagrafiche.add(a);
    }
}
