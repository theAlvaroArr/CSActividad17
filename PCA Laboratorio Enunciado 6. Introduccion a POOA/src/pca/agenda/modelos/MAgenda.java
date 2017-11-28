package pca.agenda.modelos;

import pca.agenda.contactos.fabricas.FabricaContactos;
import pca.agenda.contactos.fabricas.TContacto;
import pca.agenda.contactos.modelos.MDirectorio;
import pca.agenda.contactos.modelos.MEmergencia;
import pca.agenda.contactos.modelos.MPersona;
import pca.agenda.notas.fabricas.FabricaBlocs;
import pca.agenda.notas.modelos.MBloc;

public class MAgenda {

	private static MAgenda mAgenda = new MAgenda();

	public static MAgenda getMAgenda() {
		return mAgenda;
	}

	private MDirectorio mContactos = (MDirectorio) FabricaContactos.
			getFabrica().crearModelo(TContacto.DIRECTORIO);
	private MBloc mNotas = FabricaBlocs.getFabrica().crearModelo();

	private MAgenda() {
		mContactos.setNombre("CONTACTOS");
		mNotas.setNombre("NOTAS");

		MDirectorio mDirectorio;
		MPersona mPersona;
		MEmergencia mEmergencia;
		MDirectorio mSubDirectorio, mSubSubDirectorio;

		mPersona = new MPersona();
		mPersona.setNombre("manuel");
		mPersona.setTelefono("1111");
		mContactos.anyadir(mPersona);
		mPersona = new MPersona();
		mPersona.setNombre("paula");
		mPersona.setTelefono("2222");
		mContactos.anyadir(mPersona);

		mDirectorio = new MDirectorio();
		mDirectorio.setNombre("UPM");
		mContactos.anyadir(mDirectorio);
		mPersona = new MPersona();
		mPersona.setNombre("rector");
		mPersona.setTelefono("33333");
		mDirectorio.anyadir(mPersona);
		mPersona = new MPersona();
		mPersona.setNombre("vicerrector");
		mPersona.setTelefono("44444");
		mDirectorio.anyadir(mPersona);

		mSubDirectorio = new MDirectorio();
		mSubDirectorio.setNombre("ETSISI");
		mDirectorio.anyadir(mSubDirectorio);
		mPersona = new MPersona();
		mPersona.setNombre("director");
		mPersona.setTelefono("5555");
		mSubDirectorio.anyadir(mPersona);
		mPersona = new MPersona();
		mPersona.setNombre("jefe de estudios");
		mPersona.setTelefono("66666");
		mSubDirectorio.anyadir(mPersona);
		mPersona = new MPersona();
		mPersona.setNombre("secretaria");
		mPersona.setTelefono("77777");
		mSubDirectorio.anyadir(mPersona);
		mPersona = new MPersona();
		mPersona.setNombre("bedel");
		mPersona.setTelefono("88888");
		mSubDirectorio.anyadir(mPersona);

		mEmergencia = new MEmergencia();
		mEmergencia.setNombre("seguridad");
		mEmergencia.setTelefono("555555");
		mDirectorio.anyadir(mEmergencia);

		mSubSubDirectorio = new MDirectorio();
		mSubSubDirectorio.setNombre("LPSI");
		mSubDirectorio.anyadir(mSubSubDirectorio);
		mPersona = new MPersona();
		mPersona.setNombre("carlos");
		mPersona.setTelefono("5555");
		mSubSubDirectorio.anyadir(mPersona);
		mPersona = new MPersona();
		mPersona.setNombre("pepe");
		mPersona.setTelefono("66666");
		mSubSubDirectorio.anyadir(mPersona);

		mSubSubDirectorio = new MDirectorio();
		mSubSubDirectorio.setNombre("OEI");
		mSubDirectorio.anyadir(mSubSubDirectorio);
		mPersona = new MPersona();
		mPersona.setNombre("jose");
		mPersona.setTelefono("5555");
		mSubSubDirectorio.anyadir(mPersona);
		mPersona = new MPersona();
		mPersona.setNombre("ramon");
		mPersona.setTelefono("66666");
		mSubSubDirectorio.anyadir(mPersona);

		mSubDirectorio = new MDirectorio();
		mSubDirectorio.setNombre("ETSII");
		mDirectorio.anyadir(mSubDirectorio);
		mPersona = new MPersona();
		mPersona.setNombre("director");
		mPersona.setTelefono("5555");
		mSubDirectorio.anyadir(mPersona);
	}

	public MDirectorio getContactos() {
		return mContactos;
	}

	public MBloc getNotas() {
		return mNotas;
	}
}

