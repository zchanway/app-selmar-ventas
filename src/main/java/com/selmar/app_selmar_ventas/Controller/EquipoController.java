package com.selmar.app_selmar_ventas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("api/v1/equipos")
public class EquipoController {

  @GetMapping
  public String testJenkis(){
  return "Equipos Registrados";
 }
}
