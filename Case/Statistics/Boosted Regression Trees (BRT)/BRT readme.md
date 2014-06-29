> ###Spatial prediction of soil great groups by boosted regression trees using a limited point dataset in an arid region, southeastern Iran

Boosted regression trees (BRT) 

Boosted Regression Trees (BRT) is one of the several new techniques which aim to `improve the performance of a single model by fitting many models and combining them for prediction`.

Boosting, or more precisely, `stochastic gradient boosting`, increases the predictive performance `by reducing the over-learning, or overfitting`, that commonly occurs with simple regression trees.

However, unlike the GLM (generalized linear model), infitting a BRT model, `there is no concern regarding outliers, the number or order of predictors, missing
predictor values and variable selection`. 

Boosted regression trees are a combination of two powerful statistical techniques: `boosting and regression trees`.

Boosting is a machine learning technique similar to model averaging, where the results of several competing models are merged.Boosting uses a forward, stage-wise
procedure, where tree models arefitted iteratively to a subset of the training data. Subsets of the training data used at each iteration of model fitting are randomly selected without replacement, where the proportion of the training data used is determined by the modeler, the
“bag fraction” parameter. This procedure, known as stochastic gradient boosting, introduces an element of stochasticity that improves model accuracy and reduces overfitting `(Elith et al., 2008)`.

---

In fitting a BRT, two parameters were specified, the `learning rate` and the `tree complexity`.

The learning rate determines the contribution of each successive tree to the final model, as it proceeds through the iterations. 

The tree complexity shows whether the model would represent the main effects only (tree complexity = 1), or whether interactions should have been included (tree complexity = 2, 3…). 

Ultimately, the combination of the learning rate and tree complexity determines the total number of trees in thefinal model

---
