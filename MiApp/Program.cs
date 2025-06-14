using System;

class Estudiante
{
    public int Id;
    public string Nombres;
    public string Apellidos;
    public string Direccion;
    public string[] Telefonos;

    public Estudiante(int id, string nombres, string apellidos, string direccion, string[] telefonos)
    {
        if (telefonos.Length != 3)
            throw new Exception("Se requieren 3 teléfonos.");

        Id = id;
        Nombres = nombres;
        Apellidos = apellidos;
        Direccion = direccion;
        Telefonos = telefonos;
    }

    public void Mostrar()
    {
        Console.WriteLine($"ID: {Id}");
        Console.WriteLine($"Nombre: {Nombres} {Apellidos}");
        Console.WriteLine($"Dirección: {Direccion}");
        Console.WriteLine("Teléfonos:");
        for (int i = 0; i < Telefonos.Length; i++)
            Console.WriteLine($" {i + 1}: {Telefonos[i]}");
    }
}

class Programa
{
    static void Main()
    {
        var telefonos = new string[] { "111-2222", "333-4444", "555-6666" };
        try
        {
            var estudiante = new Estudiante(1, "Ana", "Gómez", "Calle 123", telefonos);
            estudiante.Mostrar();
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}
