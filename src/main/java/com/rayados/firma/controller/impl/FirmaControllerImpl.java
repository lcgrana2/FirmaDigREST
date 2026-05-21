/**
 * 
 */
package com.rayados.firma.controller.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rayados.firma.bean.Documento;
import com.rayados.firma.controller.FirmaController;
import com.rayados.firma.service.FirmaService;

/**
 * @author LuisC
 *
 */
@RestController
@RequestMapping("/pki")
public class FirmaControllerImpl implements FirmaController{

	@Autowired
	private FirmaService utilService;
	
	@Override
	@PostMapping("/firma")
	public Object firmarDocumento(@RequestBody Documento documento) {
		Map<String, Object> response=new HashMap<>();
		try {
			byte[] rsp = utilService.firmarPdf(documento.getData());
			response.put("estado", "OK");
			response.put("data", rsp);
		} catch (Exception e) {
			response.put("estado", "Error");
			response.put("mensaje", e.getMessage());
		}
		return response;
	}

}
