const faqs = document.querySelectorAll(".faq"),
  prices = document.querySelectorAll(".prices > ul li");

faqs.forEach((faq) => {
  faq.addEventListener("click", () => {
    faq.classList.toggle("active");
  });
});

function handleClick(e) {
  const cl = e.currentTarget.dataset.price;
  const allCl = document.querySelectorAll(`.${cl}`);

  
  prices.forEach((price) => {
    price.classList.remove("active");
  });

  
  e.currentTarget.classList.add("active");

 
  allCl.forEach((c) => {
    c.classList.add("active");
  });

  
  if (cl === "yearly") {
    document.querySelectorAll(".monthly").forEach((m) => {
      m.classList.remove("active");
    });
  } else {
    
    document.querySelectorAll(".yearly").forEach((y) => {
      y.classList.remove("active");
    });
  }
}


prices.forEach((price) => {
  price.addEventListener("click", handleClick);
});
