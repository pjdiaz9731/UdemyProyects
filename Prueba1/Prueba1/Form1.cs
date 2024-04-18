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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            personalizarDiseño();
        }

        public void personalizarDiseño() 
        {
            panelSub_Menu1.Visible = false;
            panelSub_Menu2.Visible = false;
        }

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

        public void mostrarSubMenu(Panel sub_Menu ) 
        {
            if (sub_Menu.Visible == false)
            {
                ocultarSubMenu();
                sub_Menu.Visible = true;
            }
            else 
            {
                sub_Menu.Visible = false;
            }
        }

        private void btnMatricula_Click(object sender, EventArgs e)
        {
            if (formulario != null && formulario.GetType() == typeof(FormularioCursos))
            {
                formulario.Close();
            }

            mostrarSubMenu(panelSub_Menu1);
            bigLabel1.Visible = true;
        }

        private void btnCursos_Click(object sender, EventArgs e)
        {
            abrirForms(new FormularioCursos());
            ocultarSubMenu();
            bigLabel1.Visible = false;
        }

        private void btnEstudiante_Click(object sender, EventArgs e)
        {
            ocultarSubMenu();
        }

        private void btnCarreras_Click(object sender, EventArgs e)
        {
            mostrarSubMenu(panelSub_Menu2);
        }

        private void btnFacultad_Click(object sender, EventArgs e)
        {
            ocultarSubMenu();
        }

        private void btnProfes_Click(object sender, EventArgs e)
        {
            ocultarSubMenu();
        }

        private Form formulario = null;
        private void abrirForms(Form formularioCursos)
        {
            if (formulario != null)
            {
                formulario.Close();
            }

            formulario = formularioCursos;
            formularioCursos.TopLevel = false;
            formularioCursos.FormBorderStyle = FormBorderStyle.None;
            formularioCursos.Dock = DockStyle.Fill;
            Controls.Add(formularioCursos); // Agregar al formulario contenedor
            formularioCursos.Tag = formularioCursos;
            formularioCursos.BringToFront();
            formularioCursos.Show();
        }
    }
}
