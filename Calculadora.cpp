#include <iostream>
using namespace std;


void Suma();
void Resta();
void Multiplicacion();
void Division();


int main()  
{
	int opcion;
	cout<<"Elige una opcion \n";
	cout<<"1.-Suma \n";
	cout<<"2.-Resta \n";
	cout<<"3.-Multiplicacion \n";
	cout<<"4.-Division \n";
	cin>>opcion;
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
    default:
        cout<<"No se encuentra la opcion introducida";
	}
    return 0;
}
void Suma(){
	float numero1, numero2, resultado;
    cout<<"Introduce el primer numero: ";
    cin>>numero1;
    cout<<"Introduce el segundo numero: ";
    cin>>numero2;
    resultado=numero1+numero2;
    cout<<"El resultado es: "<<resultado;
}
void Resta(){
	float numero1, numero2, resultado;
    cout<<"Introduce el primer numero: ";
    cin>>numero1;
    cout<<"Introduce el segundo numero: ";
    cin>>numero2;
    resultado=numero1-numero2;
    cout<<"El resultado es: "<<resultado;
}

void Multiplicacion(){  
    float numero1, numero2, resultado;
    cout<<"Introduce el primer numero: ";
    cin>>numero1;
    cout<<"Introduce el segundo numero: ";
    cin>>numero2;
    resultado=numero1*numero2;
    cout<<"El resultado es: "<<resultado;
}
void Division(){
	float numero1, numero2, resultado;
    cout<<"Introduce el primer numero: ";
    cin>>numero1;
    cout<<"Introduce el segundo numero: ";
    cin>>numero2;
    resultado=numero1/numero2;
    cout<<"El resultado es: "<<resultado;
}

