package letscode.logistic.controller;

import letscode.logistic.domain.Mark;
import letscode.logistic.repo.MarkRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mark")
public class MarkController extends AbstractController<Mark, MarkRepo> {
    public MarkController(MarkRepo repo) {
        super(repo);
    }
}
