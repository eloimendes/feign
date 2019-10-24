package br.com.emendes.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="cep", url="${cep.endpoint}")
public interface CepWS {

    @GetMapping("/{cep}/json/")
    Cep findByCep(@PathVariable("cep") String cep);
}
