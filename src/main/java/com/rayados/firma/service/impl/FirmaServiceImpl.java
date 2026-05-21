/**
 * 
 */
package com.rayados.firma.service.impl;

import com.rayados.firma.service.FirmaService;
import org.springframework.stereotype.Service;

import com.rayados.pki.bean.CertificadoRayados;
import com.rayados.pki.core.CertificateStore;
import com.rayados.pki.core.PadesFirma;
import com.rayados.pki.util.Constante;

/**
 * @author LuisC
 *
 */
@Service
public class FirmaServiceImpl implements FirmaService {

	@Override
	public byte[] firmarPdf(byte[] data) throws Exception {
		try {
			CertificadoRayados certificado= CertificateStore.getCertificateFromFile(Constante.CERTIFICADO, Constante.CLAVE);
			data = PadesFirma.firmarPdfAvanzado(data, certificado);
			return data;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
