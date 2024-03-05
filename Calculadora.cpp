#include <iostream>
#include <limits>

using namespace std;

void Suma();
void Resta();
void Multiplicacion();
void Division();

bool ValidarNumero(float &numero)
{
  // limpia la memoria
  cin.clear();
  cin.ignore(numeric_limits<streamsize>::max(), '\n');

  if (cin >> numero)
  {
    return true; // se introdujo un numero
  }
  else
  {
    cout << "Error: Introduzca un número válido: ";
    return false; // La entrada por teclado no fue un numero
  }
}

int main()
{
  int opcion;

  cout << "Elige una opción:\n";
  cout << "1.- Suma\n";
  cout << "2.- Resta\n";
  cout << "3.- Multiplicación\n";
  cout << "4.- División\n";

  // Validar la entrada de la opción
  while (!(cin >> opcion) || opcion < 1 || opcion > 4)
  {
    cout << "Error: Introduzca una opción válida (1-4): ";
    cin.clear();
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
  }

  switch (opcion)
  {
  case 1:
    Suma();
    break;
  case 2:
    Resta();
    break;
  case 3:
    Multiplicacion();
    break;
  case 4:
    Division();
    break;
  }

  return 0;
}

void Suma()
{
  float numero1, numero2, resultado;

  cout << "Introduce el primer número: ";
  if (!ValidarNumero(numero1))
  {
    return;
  }

  cout << "Introduce el segundo número: ";
  if (!ValidarNumero(numero2))
  {
    return;
  }

  resultado = numero1 + numero2;
  cout << "El resultado es: " << resultado << endl;
}

void Resta()
{
  float numero1, numero2, resultado;

  cout << "Introduce el primer número: ";
  if (!ValidarNumero(numero1))
  {
    return;
  }

  cout << "Introduce el segundo número: ";
  if (!ValidarNumero(numero2))
  {
    return;
  }

  resultado = numero1 - numero2;
  cout << "El resultado es: " << resultado << endl;
}

void Multiplicacion()
{
  float numero1, numero2, resultado;

  cout << "Introduce el primer número: ";
  if (!ValidarNumero(numero1))
  {
    return;
  }

  cout << "Introduce el segundo número: ";
  if (!ValidarNumero(numero2))
  {
    return;
  }

  resultado = numero1 * numero2;
  cout << "El resultado es: " << resultado << endl;
}

void Division()
{
  float numero1, numero2, resultado;

  cout << "Introduce el primer número: ";
  if (!ValidarNumero(numero1))
  {
    return;
  }

  cout << "Introduce el segundo número: ";
  if (!ValidarNumero(numero2))
  {
    return;
  }

  resultado = numero1 / numero2;
  cout << "El resultado es: " << resultado << endl;
}
