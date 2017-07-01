package com.beeva.practica.BATCH.job.fileProcessor.model;

public class Cliente {

		private String nombre;
		
		private String apellido_paterno;

		private String apellido_materno;

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime
					* result
					+ ((apellido_materno == null) ? 0 : apellido_materno
							.hashCode());
			result = prime
					* result
					+ ((apellido_paterno == null) ? 0 : apellido_paterno
							.hashCode());
			result = prime * result
					+ ((nombre == null) ? 0 : nombre.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cliente other = (Cliente) obj;
			if (apellido_materno == null) {
				if (other.apellido_materno != null)
					return false;
			} else if (!apellido_materno.equals(other.apellido_materno))
				return false;
			if (apellido_paterno == null) {
				if (other.apellido_paterno != null)
					return false;
			} else if (!apellido_paterno.equals(other.apellido_paterno))
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Cliente [nombre=" + nombre + ", apellido_paterno="
					+ apellido_paterno + ", apellido_materno="
					+ apellido_materno + "]";
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido_paterno() {
			return apellido_paterno;
		}

		public void setApellido_paterno(String apellido_paterno) {
			this.apellido_paterno = apellido_paterno;
		}

		public String getApellido_materno() {
			return apellido_materno;
		}

		public void setApellido_materno(String apellido_materno) {
			this.apellido_materno = apellido_materno;
		}

}
