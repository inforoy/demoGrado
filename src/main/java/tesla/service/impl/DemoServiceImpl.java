package tesla.service.impl;

import java.util.ArrayList;
import java.util.List;

import tesla.model.DemoModel;
import tesla.service.DemoService;

public class DemoServiceImpl implements DemoService {
	
	public List<DemoModel> listadoModelosDemo(){
		List<DemoModel> listadoModelos = new ArrayList<DemoModel>();
		
		DemoModel modeloUno = new DemoModel();
		modeloUno.setEdad(10);
		modeloUno.setNombre("Messi");
		listadoModelos.add(modeloUno);
		
		DemoModel modeloDos = new DemoModel();
		modeloDos.setEdad(15);
		modeloDos.setNombre("Luana");
		listadoModelos.add(modeloDos);
		
		return listadoModelos;
	}
}
