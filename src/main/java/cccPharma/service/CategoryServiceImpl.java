package cccPharma.service;

import cccPharma.dao.CategoryRepository;
import cccPharma.model.Category;
import cccPharma.model.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private DiscountService discountService;

    @Override
    public Category SaveOrUpdate(Category category) {
        discountService.SaveOrUpdate(category.getDiscount());
        for(Category c : categoryRepository.findAll()) {
            if(c.equals(category)) {
                return c;
            }
        }
        categoryRepository.save(category);
        return category;
    }
}