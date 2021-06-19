# My-Web-Browser-App

   This is a simple web browser based on the concept of android webkit.
   
   
   By opening this app, the user will be asked to provide the link of any site that the user wants to search in the search box.
   After that, the user will press the search icon button; so, he/she will be redirected to their desired link.
   
   # Code
      
        
       
        WebView wv = (WebView)findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("https:instagram.com");

        wv.setWebViewClient(new WebViewClient()
        {
            public boolean shouldOverrideUrlLoading( WebView view, String url)
            {
                view.loadUrl(url);
                return false;
            }
        });
   
