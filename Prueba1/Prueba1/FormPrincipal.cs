using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Prueba1
{
    public partial class FormPrincipal : Form
    {
        // Constructor
        public FormPrincipal()
        {
            InitializeComponent();
            personalizarDiseño(); // Personalizar la apariencia de los controles
            personalizarNightControlBox();
        }
        
        // Nuevo método para personalizar el NightControlBox
        private void personalizarNightControlBox()
        {
            // Cambiar el color de los íconos del NightControlBox
            nightControlBox1.CloseHoverColor = Color.Red; // Rojo al pasar el ratón sobre el ícono de cerrar
            nightControlBox1.EnableCloseColor = Color.DarkRed; // Rojo oscuro para el estado normal del ícono de cerrar

            nightControlBox1.MaximizeHoverColor = Color.Green; // Verde al pasar el ratón sobre el ícono de maximizar
            nightControlBox1.EnableMaximizeColor = Color.DarkGreen; // Verde oscuro para el estado normal del ícono de maximizar

            nightControlBox1.MinimizeHoverColor = Color.Blue; // Azul al pasar el ratón sobre el ícono de minimizar
            nightControlBox1.EnableMinimizeColor = Color.DarkBlue; // Azul oscuro para el estado normal del ícono de minimizar
        }

        // Método para personalizar la apariencia de los controles
        public void personalizarDiseño()
        {
            panelSub_Menu1.Visible = false; // Ocultar el panel de submenú 1 por defecto
            panelSub_Menu2.Visible = false; // Ocultar el panel de submenú 2 por defecto
        }

        // Método para ocultar el submenú actual
        private void ocultarSubMenu()
        {
            if (panelSub_Menu1.Visible == true)
            {
                panelSub_Menu1.Visible = false;
            }

            if (panelSub_Menu2.Visible == true)
            {
                panelSub_Menu2.Visible = false;
            }
        }

        // Método para mostrar un submenú
        public void mostrarSubMenu(Panel sub_Menu)
        {
            if (sub_Menu.Visible == false)
            {
                ocultarSubMenu(); // Ocultar otros submenús si están abiertos
                sub_Menu.Visible = true; // Mostrar el submenú seleccionado
            }
            else
            {
                sub_Menu.Visible = false; // Ocultar el submenú si ya está visible
            }
        }

        // Manejador de eventos del botón "Matrícula"
        private void btnMatricula_Click(object sender, EventArgs e)
        {
            // Cerrar formularios abiertos si es necesario
            if (formulario != null && formulario.GetType() == typeof(FormCursos))
            {
                formulario.Close();
            }

            if (formulario != null && formulario.GetType() == typeof(FormEstudiantes))
            {
                formulario.Close();
            }

            if (formulario != null && formulario.GetType() == typeof(FormFacultad))
            {
                formulario.Close();
            }

            if (formulario != null && formulario.GetType() == typeof(FormProfes))
            {
                formulario.Close();
            }

            // Mostrar el submenú 1
            mostrarSubMenu(panelSub_Menu1);

            // Mostrar un label grande asociado al botón "Matrícula"
            txtBienvenida.Visible = true;
        }

        // Manejador de eventos del botón "Cursos"
        private void btnCursos_Click(object sender, EventArgs e)
        {
            // Abrir el formulario de cursos
            abrirForms(new FormCursos());

            // Ocultar el submenú
            ocultarSubMenu();

            // Ocultar el label grande
            txtBienvenida.Visible = false;
        }

        // Manejador de eventos del botón "Estudiantes"
        private void btnEstudiante_Click(object sender, EventArgs e)
        {
            // Abrir el formulario de estudiantes
            abrirForms(new FormEstudiantes());

            // Ocultar el submenú
            ocultarSubMenu();

            // Ocultar el label grande
            txtBienvenida.Visible = false;
        }

        // Manejador de eventos del botón "Carreras"
        private void btnCarreras_Click(object sender, EventArgs e)
        {
            // Cerrar formularios abiertos si es necesario
            if (formulario != null && formulario.GetType() == typeof(FormCursos))
            {
                formulario.Close();
            }

            if (formulario != null && formulario.GetType() == typeof(FormEstudiantes))
            {
                formulario.Close();
            }

            if (formulario != null && formulario.GetType() == typeof(FormFacultad))
            {
                formulario.Close();
            }

            if (formulario != null && formulario.GetType() == typeof(FormProfes))
            {
                formulario.Close();
            }

            // Mostrar el submenú 2
            mostrarSubMenu(panelSub_Menu2);

            // Mostrar un label grande asociado al botón "Carreras"
            txtBienvenida.Visible = true;
        }

        // Manejador de eventos del botón "Facultad"
        private void btnFacultad_Click(object sender, EventArgs e)
        {
            // Abrir el formulario de facultad
            abrirForms(new FormFacultad());

            // Ocultar el submenú
            ocultarSubMenu();

            // Ocultar el label grande
            txtBienvenida.Visible = false;
        }

        // Manejador de eventos del botón "Profes"
        private void btnProfes_Click(object sender, EventArgs e)
        {
            // Abrir el formulario de profesores
            abrirForms(new FormProfes());

            // Ocultar el submenú
            ocultarSubMenu();

            // Ocultar el label grande
            txtBienvenida.Visible = false;
        }

        // Campo para almacenar el formulario actual
        private Form formulario = null;
        // Método para abrir formularios y gestionar el formulario actual
        private void abrirForms(Form FormCurso)
        {
            // Cerrar el formulario actual si existe alguno
            if (formulario != null)
            {
                formulario.Close();
            }

            // Asignar el nuevo formulario como formulario actual
            formulario = FormCurso;

            // Indicar que el formulario no es de nivel superior para poder ser insertado en otro formulario
            FormCurso.TopLevel = false;

            // Establecer el estilo de borde del formulario como ninguno para que no tenga borde al ser insertado en otro formulario
            FormCurso.FormBorderStyle = FormBorderStyle.None;

            // Ajustar el formulario al tamaño del panel contenedor para que ocupe todo el espacio disponible
            FormCurso.Dock = DockStyle.Fill;

            // Agregar el formulario al panel contenedor de este formulario (FormPrincipal)
            Controls.Add(FormCurso);

            // Asignar una etiqueta de identificación al formulario para poder referenciarlo posteriormente si es necesario
            FormCurso.Tag = FormCurso;

            // Llevar el formulario al frente para que sea visible
            FormCurso.BringToFront();

            // Mostrar el formulario
            FormCurso.Show();
        }

        // Método para abrir el formulario de estudiantes
        private void abrirForms2(Form FormEstudiantes)
        {
            // Cerrar el formulario actual si existe alguno
            if (formulario != null)
            {
                formulario.Close();
            }

            // Asignar el nuevo formulario como formulario actual
            formulario = FormEstudiantes;

            // Indicar que el formulario no es de nivel superior para poder ser insertado en otro formulario
            FormEstudiantes.TopLevel = false;

            // Establecer el estilo de borde del formulario como ninguno para que no tenga borde al ser insertado en otro formulario
            FormEstudiantes.FormBorderStyle = FormBorderStyle.None;

            // Ajustar el formulario al tamaño del panel contenedor para que ocupe todo el espacio disponible
            FormEstudiantes.Dock = DockStyle.Fill;

            // Agregar el formulario al panel contenedor de este formulario (FormPrincipal)
            Controls.Add(FormEstudiantes);

            // Asignar una etiqueta de identificación al formulario para poder referenciarlo posteriormente si es necesario
            FormEstudiantes.Tag = FormEstudiantes;

            // Llevar el formulario al frente para que sea visible
            FormEstudiantes.BringToFront();

            // Mostrar el formulario
            FormEstudiantes.Show();
        }

        // Método para abrir el formulario de facultad
        private void abrirForms3(Form FormFacultad)
        {
            // Cerrar el formulario actual si existe alguno
            if (formulario != null)
            {
                formulario.Close();
            }

            // Asignar el nuevo formulario como formulario actual
            formulario = FormFacultad;

            // Indicar que el formulario no es de nivel superior para poder ser insertado en otro formulario
            FormFacultad.TopLevel = false;

            // Establecer el estilo de borde del formulario como ninguno para que no tenga borde al ser insertado en otro formulario
            FormFacultad.FormBorderStyle = FormBorderStyle.None;

            // Ajustar el formulario al tamaño del panel contenedor para que ocupe todo el espacio disponible
            FormFacultad.Dock = DockStyle.Fill;

            // Agregar el formulario al panel contenedor de este formulario (FormPrincipal)
            Controls.Add(FormFacultad);

            // Asignar una etiqueta de identificación al formulario para poder referenciarlo posteriormente si es necesario
            FormFacultad.Tag = FormFacultad;

            // Llevar el formulario al frente para que sea visible
            FormFacultad.BringToFront();

            // Mostrar el formulario
            FormFacultad.Show();
        }

        // Método para abrir el formulario de profesores
        private void abrirForms4(Form FormProfes)
        {
            // Cerrar el formulario actual si existe alguno
            if (formulario != null)
            {
                formulario.Close();
            }

            // Asignar el nuevo formulario como formulario actual
            formulario = FormProfes;

            // Indicar que el formulario no es de nivel superior para poder ser insertado en otro formulario
            FormProfes.TopLevel = false;

            // Establecer el estilo de borde del formulario como ninguno para que no tenga borde al ser insertado en otro formulario
            FormProfes.FormBorderStyle = FormBorderStyle.None;

            // Ajustar el formulario al tamaño del panel contenedor para que ocupe todo el espacio disponible
            FormProfes.Dock = DockStyle.Fill;

            // Agregar el formulario al panel contenedor de este formulario (FormPrincipal)
            Controls.Add(FormProfes);

            // Asignar una etiqueta de identificación al formulario para poder referenciarlo posteriormente si es necesario
            FormProfes.Tag = FormProfes;

            // Llevar el formulario al frente para que sea visible
            FormProfes.BringToFront();

            // Mostrar el formulario
            FormProfes.Show();
        }
    }
}
