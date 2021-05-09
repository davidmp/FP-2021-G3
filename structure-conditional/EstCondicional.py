def estCondicional01():
  #Definir variables y otros
  print("Ejemplo estructura Condicional en Python")
  montoP=0
  #Datos de entrada
  cantidadX=int(input("Ingrese la cantidad de lapices:"))
  #Proceso
  if cantidadX>=1000:        
    montoP=cantidadX*0.80
  else:
    montoP=cantidadX*0.90  
  #Datos de salida
  print("El monto a pagar es:", montoP)
def estCondicional02():
  #Definir variables y otros
  print("Ejercicio 02 Est. Condicional")
  montoP=0
  #Datos de entrada
  cantidadX=int(input("Ingrese la cantidad personas invitadas:"))
  #Proceso
  if cantidadX<200:
    montoP=cantidadX*95
  elif cantidadX>200 and cantidadX<=300:
    montoP=cantidadX*85
  else:
    montoP=cantidadX*75
  #Datos de salida
  print("La cantidad a pagar es:", montoP)
def votoElecciones():
  print ("Como saber si puedes votar por tu edad")
  mensaje=""
  edadP=int(input("ingrese la edad que tiene:"))
  if edadP>=18:
    mensaje="Usted tiene la edad necesaria para votar"
  else:
    mensaje="Usted no cumple con la edad minima para votar"
  print(mensaje) 

def pagoSemanaBase40horas():
  print ("Pago semanal del trabajador")
  sueldoPagarSem=0.0
  #Datos de entrada
  horasTra=int(input("Ingrese horas trabajadas a la semana:"))
  horasPago=int(input("Ingrese el pago por hora:")) 
  #Proceso 
  if horasTra>40:
    sueldoPagarSem=40*horasPago+(horasTra-40)*2*horasPago
  else:
    sueldoPagarSem=horasTra*horasPago
  #Datos de salida
  print("El sueldo a pagar al trabajador es:", sueldoPagarSem)

def notaPostulanteEstMultiple():
  #Definir Variables
  notaFinal=0
  #Datos de entrada  
  areaCarrera=input("Introduce el area a la que corresponde tu carrera:\nB=Biomedicas\nI=Ingenieria\nS=Sociales")  
  notaEP=float(input("Ingrese la nota de EP:"))
  notaRM=float(input("Ingrese la nota de RM:"))
  notaRV=float(input("Ingrese la nota de RV:"))
  notaAB=float(input("Ingrese la nota de AB:"))
  #Proceso
  if areaCarrera=="B":    
    notaFinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.20)+(notaAB*0.30)
    areaCarrera="Biomedicas"
  elif areaCarrera=="I":
    notaFinal=(notaEP*0.40)+(notaRM*0.30)+(notaRV*0.15)+(notaAB*0.15)
    areaCarrera="Ingenierias"
  elif areaCarrera=="S":
    notaFinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.30)+(notaAB*0.20)
    areaCarrera="Sociales"
  else:
    print("La opcion que ingreso no es valida...intente nuevamente!.")
  print("El postulante obtuvo un nota de:",notaFinal,"\nY su carrera corresponde al area de:",areaCarrera)         



#estCondicional01()
#estCondicional02()
#votoElecciones()
#pagoSemanaBase40horas()
notaPostulanteEstMultiple()