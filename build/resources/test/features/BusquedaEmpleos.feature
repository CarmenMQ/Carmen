@regression @positive
Feature: Busqueda de Empleos
  Esta caracteristica permite a las personas buscar empleo por medio de la pagina
  de choucairtesting por medio de los filtros de palabras claves o localidad.

  Scenario: Busqueda de Empleos choucairtesting
  Este escenario consiste en buscar empleos.

    Given El usuario entra a la pagina y ingresa a la opcion de empleos
    When  ingresa la busqueda por keyword "Analista de Pruebas"
    And   luego el usuario selecciona un registro de empleos.
    Then  Verifica el detalle del puesto  y se muestra el boton "APPLY FOR JOB"