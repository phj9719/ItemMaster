package itemmaster.infra;

import itemmaster.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/processes")
@Transactional
public class ProcessController {

    @Autowired
    ProcessRepository processRepository;

    @PutMapping("/processes/search/findByItemCd")
    public Object findByItemCd(@RequestBody ProcessViewQuery query) {
        return processRepository.findByItemCd(query.getItemCd());
    }
}
